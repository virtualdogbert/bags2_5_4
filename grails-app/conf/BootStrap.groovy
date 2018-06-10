import bags.BagService

class BootStrap {
    BagService bagService

    def init    = { servletContext ->
        bagService.init()
        bagService.followup()
        bagService.deleteAuthor()
        bagService.deleteBook()
        bagService.listLinks()
    }
    def destroy = {
    }
}
