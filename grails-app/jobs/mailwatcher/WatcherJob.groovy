package mailwatcher

import grails.util.Holders

class WatcherJob {
    static triggers = {
      simple repeatInterval: 5000l // execute job once in 5 seconds
    }

    EmailReaderService emailReaderService

    def timeout = readTimeOut

    Long getReadTimeOut() {
        return Holders.config.grails.mailwatcher.readTimeOut ?: 60000
    }

    def execute() {
        emailReaderService.saveMailsToDB()
    }
}
