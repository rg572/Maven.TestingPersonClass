package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }




    @Test
    public void testSetCatchPhrase(){
        Person person = new Person();
        String expected = "Quidquid Latine dictum sit, altum videtur";

        person.setCatchPhrase(expected);
        String actual = person.getCatchPhrase();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testDefaultCatchPhrase(){
        Person person = new Person();
        String expected = "";

        String actual = person.getCatchPhrase();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testSetNemesis(){
        Person person = new Person();
        String expected = "The perfidious Latins";

        person.setNemesis(expected);
        String actual = person.getNemesis();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testDefaultNemesis(){
        Person person = new Person();
        String expected = "";

        String actual = person.getNemesis();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetConsul(){
        Person person = new Person();
        Boolean expected = true;

        person.setConsul(expected);
        Boolean actual = person.getConsul();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testDefaultConsul(){
        Person person = new Person();
        Boolean expected = false;

        Boolean actual = person.getConsul();

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testGetPraetorialProvince(){
        Person person = new Person();
        String expected = "Gallia Narbonensis";

        person.setPraetorialProvince(expected);
        String actual = person.getPraetorialProvince();

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testDefaultPraetorialProvince(){
        Person person = new Person();
        String expected = "";

        String actual = person.getPraetorialProvince();

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testSetTriumphs(){
        Person person = new Person();
        Integer expected = 2;

        person.setTriumphs(expected);
        Integer actual = person.getTriumphs();

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testSetTriumphsNegative(){
        Person person = new Person();
        Integer expected = 0;

        person.setTriumphs(-2);
        Integer actual = person.getTriumphs();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testDefaultTriumphs(){
        Person person = new Person();
        Integer expected = 0;

        Integer actual = person.getTriumphs();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAgeNegative(){
        Person person = new Person();
        Integer expected = 0;

        person.setAge(-5);
        Integer actual = person.getAge();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAgeNegative(){
        Person person = new Person(-10);
        Integer expected = 0;

        Integer actual = person.getAge();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithNameAndAgeNegative(){
        Person person = new Person("Arius of Alexandria", -34);
        Integer expected = 0;

        Integer actual = person.getAge();

        Assert.assertEquals(expected, actual);
    }

}
