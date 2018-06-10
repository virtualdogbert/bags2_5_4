package bags


class Author {
   String name
   Collection authorBooks
   static hasMany = [authorBooks: AuthorBook]

   //Doesn't seem to work, but I think this can be fixed with a db migration
//   static  mapping = {
//       authorBooks cascade: "all-delete-orphan"
//    }
}
