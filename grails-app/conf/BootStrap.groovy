import bags.BagService

class BootStrap {
    BagService bagService

    def init    = { servletContext ->
        bagService.init()
        bagService.followup()
    }
    def destroy = {
    }
}
