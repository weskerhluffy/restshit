package restshit
import grails.rest.Resource;

@Resource(uri='/books')
class Book {

	String title
	String author
	Double price

	static constraints = {
		title blank:false
		author blank:false
	}
}