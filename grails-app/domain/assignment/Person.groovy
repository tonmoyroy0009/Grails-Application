package assignment

class Person {
    Integer personID
    String personName


    static constraints = {
        personID maxSize: 100
        personName maxSize: 100
    }
}
