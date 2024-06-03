package junit.excample_5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class AgeCategoryTest {

    private final AgeCategory ageCategory = new AgeCategory();

    // Граничные значения
    @Test
    void testBoundaryChildToTeenager() {
        assertEquals("Ребенок", ageCategory.getCategory(12));
        assertEquals("Подросток", ageCategory.getCategory(13));
    }

    @Test
    void testBoundaryTeenagerToAdult() {
        assertEquals("Подросток", ageCategory.getCategory(17));
        assertEquals("Взрослый", ageCategory.getCategory(18));
    }

    @Test
    void testBoundaryAdultToSenior() {
        assertEquals("Взрослый", ageCategory.getCategory(64));
        assertEquals("Пенсионер", ageCategory.getCategory(65));
    }

    @Test
    void testNegativeAge(){
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> ageCategory.getCategory(-1));
        assertEquals("Число меньше 0", ex.getMessage());
    }


    // Классы эквивалентности
    @Test
    void testChildCategory() {
        assertEquals("Ребенок", ageCategory.getCategory(5));
    }

    @Test
    void testTeenagerCategory() {
        assertEquals("Подросток", ageCategory.getCategory(15));
    }

    @Test
    void testAdultCategory (){
        assertEquals("Взрослый", ageCategory.getCategory(30));
    }

    @Test
    void testSeniorCategory (){
        assertEquals("Пенсионер", ageCategory.getCategory(70));
    }


}

