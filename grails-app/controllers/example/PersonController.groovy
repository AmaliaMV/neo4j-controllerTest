package example

class PersonController {

	static responseFormats = ['json', 'xml']
	
    def get1() {
        respond Person.first()
    }

    def get2() {
        respond Person.first()
    }
}
