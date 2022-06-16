package assignment

class SubmitController {

    def index() {
        redirect (action: "submitIndex")
    }

    def submitIndex()  {
        redirect(action: "listPerson")
    }

    def listPerson = {
        def pId = params.personId
        def pName = params.personName

        println("Person ID:" + pId)
        println("Person Name:" + pName)

        if (pId && pName){
            results = submit.here
                    {
                        personId == pId
                        personName == pName
                        changeIndicator == null

                    }
        }
        else if (pId)
        {
            results = submit.here
                    {
                        personId == pId
                        changeIndicator == null
                    }
        }
        else if (pName)
        {
            results = submit.here
                    {
                        personName == pName
                        changeIndicator == null
                    }

        }
        [person:listPerson]
    }

}
