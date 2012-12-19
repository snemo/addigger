package addigger.ad

class Advertisement implements Serializable {

	byte priority
	String title
	String description
	Date dateCreated
	
    static constraints = {
    }
}
