# graphqlBooksPOC
standalone graphql books POC with 3 book details.

Run the program and can be tested in postman by-
method: post
url: http://localhost:8092/rest/books
request raw body:
  query{
       allBooks{
         isn
         title
         publisher
         authors
         publishedDate
        }
  }
  
response will come like below:
{
    "errors": [],
    "data": {
        "allBooks": [
            {
                "isn": "123",
                "title": "Book of Clouds",
                "publisher": "Kindle Edition",
                "authors": [
                    "Chloe Aridjis"
                ],
                "publishedDate": "Nov 2017"
            },
            {
                "isn": "124",
                "title": "Cloud Arch & Engineering",
                "publisher": "Orielly",
                "authors": [
                    "Peter",
                    "Sam"
                ],
                "publishedDate": "Jan 2015"
            },
            {
                "isn": "125",
                "title": "Java 9 Programming",
                "publisher": "Orielly",
                "authors": [
                    "Venkat",
                    "Ram"
                ],
                "publishedDate": "Dec 2016"
            }
        ]
    },
    "extensions": null
}

********************
request-
query{
    book(id: "124")
    {
     isn
  title
  publisher
  authors
  publishedDate
    }
}

response-
{
    "errors": [],
    "data": {
        "book": {
            "isn": "124",
            "title": "Cloud Arch & Engineering",
            "publisher": "Orielly",
            "authors": [
                "Peter",
                "Sam"
            ],
            "publishedDate": "Jan 2015"
        }
    },
    "extensions": null
}
