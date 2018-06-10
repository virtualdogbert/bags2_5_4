package bags

import grails.transaction.Transactional

@Transactional
class BagService {
    void init() {
        Author author = new Author(name: 'Hunter S. Thompson')
        author.addToBooks(title: 'Fear and Loathing in Las Vegas')
        author.save()

    }

    void followup() {
        Author author = Author.get(1)
        author.addToBooks(title: "Hell's Angels: A Strange and Terrible Saga")
        author.save()
    }
}
