package CLASSES

class Product {
    String name
    String description

    static hasMany = [
            offers : Offer
            print
    ]

    static constraints = {
        name(blank: false)
        description(maxSize: 200, nullable: true)
    }
}
