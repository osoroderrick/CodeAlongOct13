package dependencyInversionPrinciple;

import java.util.List;

public interface CustomerRepository {
    List<String> findNames();
}
