package part2;

public class dataBaseOperation {
        private String url;
        private String username;
        private String password;
    public void setUrl(String url) {
        this.url = url;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void operation(String url, String username, String password) {
            this.url = url;
            this.username = username;
            this.password = password;
        }

        public void store(String vechicleName) {
            System.out.println(String.format("Connecting to -%s- whose username is -%s- with pass -%s-", url, username, password));
            System.out.println(String.format("Storing %s into DB" , vechicleName));
         }
    }
