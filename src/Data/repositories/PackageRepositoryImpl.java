package Data.repositories;

import java.util.ArrayList;
import java.util.List;
import Data.model.Package;

public class PackageRepositoryImpl implements PackageRepository {
    private int lastIdCreated;
    private List<Package> packages = new ArrayList<>();

    public Package save(Package aPackage) {
        boolean isSaved = aPackage.getId() != 0;
        if (isSaved) update(aPackage); else saveNewPackage(aPackage);


        return aPackage;
    }

    private void update(Package aPackage){
//        Package savedPackage = findById(aPackage.getId());
//        int indexOfSavedPackages = packages.indexOf(savedPackage);
//        packages.set(indexOfSavedPackages, aPackage);

        Package savedPackage = findById(aPackage.getId());
        packages.remove(savedPackage);
        packages.add(aPackage);


    }

    private void saveNewPackage(Package aPackage) {
        packages.add(aPackage);
        aPackage.setId(generatePackageId());
        lastIdCreated++;
    }

    private int generatePackageId(){
        return lastIdCreated +1;
    }

    @Override
    public long count() {
        return packages.size();
    }

    public void delete(Package aPackage) {
        packages.remove(aPackage);

    }

    public void delete(int id) {
        Package foundPackage = findById(id);
        delete(foundPackage);

    }

    public List<Package> findAll() {
        return packages;
    }

    public Package findById(int id) {
        for (Package aPackage : packages) if(aPackage.getId() == id) return aPackage;


        return null;
    }
}
