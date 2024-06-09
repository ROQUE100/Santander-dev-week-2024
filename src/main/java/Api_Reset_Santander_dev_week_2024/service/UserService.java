package Api_Reset_Santander_dev_week_2024.service;
import Api_Reset_Santander_dev_week_2024.domain.model.User;
public interface UserService {
    User findById(Long id);

    User create(User userToCreate);
}
