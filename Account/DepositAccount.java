package Account;

import java.math.BigDecimal;

public class DepositAccount extends Account { /** Класс-наследник класса - Аккаунт */
    
 @Override
    public BigDecimal balance(String numberAccount) { /** метод просмотра баланса */
        return null;
    }

    @Override
    public void refill (String numberAccount, BigDecimal sum) { /** Метод пополенния счёта */

    }
}
