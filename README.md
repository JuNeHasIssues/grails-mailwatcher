# grails-mailwatcher
To Grails 3 updated Version of https://github.com/IntelliGrape/Grails-Mail-Watcher-Plugin


### Usage Information

Configure: The plugin needs the following properties**

```
grails {
    mailwatcher {
        email = "_youremailId_"
        password = "_password_"
        readTimeOut = 10000
        folderToRead="Inbox"
        protocol = "imaps"
        host = "imap.gmail.com"
        port = "993"
        excludeSender = "test@test.com,test1@test1.com"
    }
}
```

  * **readTimeOut** Timeout For WatcherJob

  * **folderToRead** This is the name of the Folder that app reads. Defaults to Inbox.Any other folder in your mail can also be specified.

  * **protocol** Protocol used for reading mail

  * **host** Hostname for the mail server 

  * **port** Port to which app connects
  
  * **excludeSender** (optional) Mails from this sender/these senders won't be saved

To log the mails that are read, change the logging level to info**

***
**RoadMap**

* Searching for mails can be based on patterns

* Folder to look for in Mail can be given as regex

* Can fire mail received event when a mail with specific pattern is received.
