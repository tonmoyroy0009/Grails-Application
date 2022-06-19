package assignment

import java.awt.TextArea

class Person {
    String personName
    String mobileNo

    /*Address address
    static belongsTo = [address: Address]*/

    static constraints = {
        personName maxSize: 100
        mobileNo maxSize: 100
    }
}
