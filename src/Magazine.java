import java.lang.reflect.Member;

public abstract class Magazine implements LibraryResource {
        protected String title;
        protected String author;
        protected double rentalFee;

        public Magazine(String title, String author, double rentalFee){
            this.title = title;
            this.author = author;
            this.rentalFee = rentalFee;
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        public double getRentalFee() {
            return rentalFee;
        }
        @Override
        public void printResourceDetails(){
            System.out.println("This is Details" + title + author);

        }
        @Override
        public void borrowResource(Member member){
            System.out.println("We rent books at a fee od " + rentalFee);


        }
        @Override
        public void returnResource(Member member){


        }

    }


