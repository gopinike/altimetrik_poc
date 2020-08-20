# Bus Reservation



Below are the REST end-points that provide Bus Ticket Booking. 

1. POST /bus/search
2. GET  /bus/sheetDetails?busID=
3. POST /bus/bookSheet
4. POST /bus/cancelBooking

#Sample Input

1. 	{
	  "sourceCity" : "chennai",
	  "destinationCity" : "dindigul", 
	  "travelDate" : "2020-0819",
	  "returnDate" : "2020-08-21"
	}

2.  /bus/sheetDetails?busID=1

3. {
	  "busID" : 1,
	  "sheetNo" : "S1",
	  "name" : "Gopi",
	  "mobileNumber" : "909090",
	  "status" : 1 
   }
   
4. {
      "bookingId": 1,
      "busID": 1,
      "sheetNo": "S1",
      "name": "Gopi",
      "mobileNumber": "909090",
      "status": 0
	} 

## Technologies 

1. Java
2. Spring Boot
3. Spring Data JPA (Data persistence)
4. H2

