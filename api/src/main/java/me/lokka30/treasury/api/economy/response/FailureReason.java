package me.lokka30.treasury.api.economy.response;

/**
 * A collection of constants describing common causes for request failures.
 *
 * @since v1.0.0
 */
public enum FailureReason {

    /**
     * Use this constant if the method can't be run in any capacity
     * as the economy provider does not provide support for the method.
     * It is paramount that plugins ensure that economy providers support
     * certain methods (e.g. bank accounts) before attempting to access them.
     *
     * @since v1.0.0
     */
    FEATURE_NOT_SUPPORTED,

    /**
     * A constant represeting failure due to economies being in the middle
     * of migrating.
     *
     * @since v1.0.0
     */
    MIGRATION,

    /**
     * A constant representing failure due to request cancellation.
     *
     * @since v1.0.0
     */
    REQUEST_CANCELLED,

    /* Accounts */

    /**
     * A constant representing failure due to the inability to locate an
     * {@link me.lokka30.treasury.api.economy.account.Account Account}.
     *
     * @since v1.0.0
     */
    ACCOUNT_NOT_FOUND,

    /**
     * A constant representing failure due to
     * {@link me.lokka30.treasury.api.economy.account.Account Account}
     * deletion being unsupported.
     *
     * @since v1.0.0
     */
    ACCOUNT_DELETION_NOT_SUPPORTED,

    /**
     * A constant representing failure due to an
     * {@link me.lokka30.treasury.api.economy.account.Account Account}
     * already existing.
     *
     * @since v1.0.0
     */
    ACCOUNT_ALREADY_EXISTS,

    /* BankAccounts */

    /**
     * A constant representing failure due to a user already being a member of a
     * {@link me.lokka30.treasury.api.economy.account.BankAccount BankAccount}.
     *
     * @since v1.0.0
     */
    ALREADY_MEMBER_OF_BANK_ACCOUNT,

    /**
     * A constant representing failure due to a user already being an owner of a
     * {@link me.lokka30.treasury.api.economy.account.BankAccount BankAccount}.
     *
     * @since v1.0.0
     */
    ALREADY_OWNER_OF_BANK_ACCOUNT,

    /**
     * A constant representing failure due to a user already not being a member of a
     * {@link me.lokka30.treasury.api.economy.account.BankAccount BankAccount}.
     *
     * @since v1.0.0
     */
    ALREADY_NOT_MEMBER_OF_BANK_ACCOUNT,

    /**
     * A constant representing failure due to a user already not being an owner of a
     * {@link me.lokka30.treasury.api.economy.account.BankAccount BankAccount}.
     *
     * @since v1.0.0
     */
    ALREADY_NOT_OWNER_OF_BANK_ACCOUNT,

    /* Balances */

    /**
     * A constant representing failure due to an overdraft when
     * negative balances are not supported.
     *
     * @since v1.0.0
     */
    NEGATIVE_BALANCES_NOT_SUPPORTED,

    /**
     * A constant representing failure due to a negative amount being
     * provided to a method that only accepts positive numbers.
     *
     * @see me.lokka30.treasury.api.economy.account.Account#withdrawBalance(double, me.lokka30.treasury.api.economy.currency.Currency, EconomySubscriber)
     * @see me.lokka30.treasury.api.economy.account.Account#depositBalance(double, me.lokka30.treasury.api.economy.currency.Currency, EconomySubscriber)
     * @since v1.0.0
     */
    NEGATIVE_AMOUNT_SPECIFIED,

    /* Currencies */

    /**
     * A constant representing failure due to the inability to locate a
     * {@link me.lokka30.treasury.api.economy.currency.Currency Currency}.
     *
     * @since v1.0.0
     */
    CURRENCY_NOT_FOUND,

    /**
     * Use this constant if the method resulted in a complete failure,
     * AND no other constant in this enum is applicable to the issue
     * that occured. In this case, use this constant, and please
     * submit a pull request or issue so that a future Treasury version
     * can accomodate for this issue.
     *
     * @since v1.0.0
     */
    OTHER_FAILURE

}