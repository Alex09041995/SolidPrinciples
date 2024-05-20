package Account;

import java.math.BigDecimal;

public class SalaryAccount extends Account { /** Класс-наследник класса - Аккаунт */
    
    @Override
    public BigDecimal balance(String numberAccount) { /** метод просмотра баланса */
        return null;
    }

    @Override
    public void refill (String numberAccount, BigDecimal sum) { /** Метод пополенния счёта */

    }

    @Override
    public void payment (String numberAccount, BigDecimal sum) { /** метод оплаты */

    }


}
