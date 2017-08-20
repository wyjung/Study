package contacts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by wyjung on 2017-08-20.
 */

@Repository
public class ContactRepository {
    private JdbcTemplate jdbc;

    @Autowired
    public ContactRepository(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public List<Contact> findAll() {
        return jdbc.query("SELECT id, firstName, lastName, phoneNumber, emailAddress" +
                " FROM contacts ORDER BY lastName",
                new RowMapper<Contact>() {
                    @Override
                    public Contact mapRow(ResultSet rs, int rowNum) throws SQLException {
                        Contact contact = new Contact();
                        contact.setId(rs.getLong(1));
                        contact.setFirstName(rs.getString(2));
                        contact.setLastName(rs.getString(3));
                        contact.setPhoneNumber(rs.getString(3));
                        contact.setEmailAddress(rs.getString(4));
                        return contact;
                    }
                });
    }

    public void save(Contact contact) {
        jdbc.update("INSERT INTO contacts (firstName, lastName, phoneNumber, emailAddress) values (?, ?, ?, ?)",
                contact.getFirstName(),
                contact.getLastName(),
                contact.getPhoneNumber(),
                contact.getEmailAddress());
    }
}
