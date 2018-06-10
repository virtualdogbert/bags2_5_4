package bags

class Book {
   String title
   Collection authors
   static hasMany = [authors: Author]
   static belongsTo = Author
}