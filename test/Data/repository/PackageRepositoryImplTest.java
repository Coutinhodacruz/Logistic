package Data.repository;

import Data.model.Package;
import Data.repositories.PackageRepository;
import Data.repositories.PackageRepositoryImpl;
import org.junit.jupiter.api.*;


import static org.junit.jupiter.api.Assertions.*;

class PackageRepositoryImplTest {

    private PackageRepository packageRepository;

    @BeforeEach
    public void setUp(){
        packageRepository = new PackageRepositoryImpl();
    }

    @Test
    @DisplayName("Create new package test")
    public void saveOnePackage_countIsOneTest(){
        Package aPackage = new Package();
        assertEquals(0, packageRepository.count());
        packageRepository.save(aPackage);

        assertEquals(1, packageRepository.count());

    }
    @Test
    @DisplayName("Generate ID test")
    public void saveOnePackage_IdIsOneTest(){
        Package aPackage = new Package();
        assertEquals(0, aPackage.getId());
        Package savedPackage = packageRepository.save(aPackage);

    }
    @Test
    @DisplayName("Find by id test")
    public void saveOnePackage_findPackageById_returnsSavedPackageTest(){
        Package aPackage = new Package();
        aPackage.setPayOnDelivery(true);
        packageRepository.save(aPackage);
        Package foundPackage = packageRepository.findById(1);
        assertEquals(1, foundPackage.getId());
        assertTrue(foundPackage.isPayOnDelivery());
        assertEquals(aPackage, foundPackage);

    }
    @Test
    @DisplayName("Update test")
    public void saveTwoItemsWithSameId_countIsOneTest(){
        Package aPackage = new Package();
        aPackage.setWeighInGrammes(34);
        packageRepository.save(aPackage);
        Package savedPackage = packageRepository.findById(1);
        assertEquals(aPackage, savedPackage);


        Package secondPackage = new Package();
        secondPackage.setId(1);
        secondPackage.setWeighInGrammes(22);
        packageRepository.save(secondPackage);
        Package foundPackage = packageRepository.findById(1);

        assertEquals(foundPackage, secondPackage);
        assertNotEquals(foundPackage, aPackage);

    }
    @Test
    @DisplayName("Delete test")
    public void deleteIdTest(){
        Package aPackage = new Package();
    }

}