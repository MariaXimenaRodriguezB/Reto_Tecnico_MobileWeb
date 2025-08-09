@mobile

Feature: Calculator mobile
  I, as a user, want to perform operations in the application to verify the results

  Scenario Outline: Calculator operations
    Given Into the application
    When  Enter the number and type of operation
    | numberOne | numberTwo   | operation |
    |<numberOne>| <numberTwo> |<operation>|
    Then  Validate the results
    Examples:
      | numberOne | numberTwo | operation |
      | 1         | 2         |plus       |
      | 7         | 9         |multiply   |
      | 1         | 2         |minus      |
      | 15        | 5         |divide     |