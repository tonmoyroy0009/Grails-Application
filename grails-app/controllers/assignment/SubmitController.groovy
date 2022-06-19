package assignment

import com.bitmascot.ocb.SubmitService
import grails.web.servlet.mvc.GrailsParameterMap
import grails.plugin.springsecurity.annotation.Secured

@Secured(['permitAll'])
class SubmitController {

    SubmitService submitService

    def index() {
        def personList = submitService.list()
        [persons: personList]
    }

    def submitIndex()  {

    }

    def postMethod() {
        submitService.save(params)
        redirect(controller: "submit", action: "index")
    }

}
