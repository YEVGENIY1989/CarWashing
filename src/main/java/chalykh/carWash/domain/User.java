package chalykh.carWash.domain;

import javax.persistence.*;

@Entity // указывает что класс является сущностью(из БД) Сущность это тип объекта который должен хранится в БД
// Каждая таблица в базе данных должна представлять одну сущность
@Table(name = "users") // указывает название таблицы бд
public class User {

    @Id // указывает что ID таблицы
    @GeneratedValue(strategy = GenerationType.IDENTITY) // указывает как генерить значение.В данном случае автоматический
    private Integer id;

    @Column(name = "first_name", length = 50, nullable = false) // указывает поля бд
    private String firstName;

    @Column(name = "last_name", length = 50, nullable = false)
    private String lastName;

    public User(){

    }

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
