package bank;

public class Customer {
  private int id;
  private String name;
  private String username;
  private String password;
  private int account_Id;
  private boolean authenticated;

  public boolean isAuthenticated() {
    return this.authenticated;
  }

  public void setAuthenticated(boolean authenticated) {
    this.authenticated = authenticated;
  }

  public Customer(int id, String name, String username, String password, int accountId) {
    setId(id);
    setName(name);
    setUsername(username);
    setPassword(password);
    setAccount_Id(accountId);
    setAuthenticated(false);
  }

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getUsername() {
    return this.username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return this.password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public int getAccount_Id() {
    return this.account_Id;
  }

  public void setAccount_Id(int accountId) {
    this.account_Id = accountId;
  }

}
