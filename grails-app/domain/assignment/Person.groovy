package assignment

import java.awt.TextArea

class Person {
    String personName
    String mobileNo


    static constraints = {
        personName maxSize: 100
        mobileNo maxSize: 100
    }
}
