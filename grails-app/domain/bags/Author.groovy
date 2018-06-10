package bags


class Author {
   String name
   Collection books
   static hasMany = [books: Book]
}
