package assignment

class Address {

    String address
    String phoneNumber
    Person person

    static constraints = {
        address maxSize: 100
        phoneNumber maxSize: 100
    }
}
