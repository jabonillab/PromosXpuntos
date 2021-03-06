package CLASSES

class Campaign extends Offer {
    String description
    String something

    static belongsTo = [
            customer : Customer
    ]

    static constraints = {
        description(blank: false)
    }

    static mapping = {
        table('campaign')
    }
}
