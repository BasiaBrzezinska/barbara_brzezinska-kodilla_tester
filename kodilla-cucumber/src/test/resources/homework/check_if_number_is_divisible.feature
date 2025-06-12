Feature:  Check if a number is divisible by 3, 5, or both

  Scenario Outline: Number is divisible by 3?
    Given number is <number>
    When I check if it's divisible by 3
    Then it should return <answer>
    Examples:
      | number | answer |
      | 3      | "Fizz" |
      | 9      | "Fizz" |
      | 21      | "Fizz" |
      | 11      | "None" |
      | 7      | "None" |

  Scenario Outline: Number is divisible by 5?
    Given number is <number>
    When I check if it's divisible by 5
    Then it should return <answer>
    Examples:
      | number | answer |
      | 5      | "Buzz" |
      | 10     | "Buzz" |
      | 20     | "Buzz" |
      | 4      | "None" |
      | 7      | "None" |

  Scenario Outline: Number is divisible by 3 and 5?
    Given number is <number>
    When I check if it's divisible by 3 and 5
    Then it should return <answer>
    Examples:
      | number | answer     |
      | 15     | "FizzBuzz" |
      | 30     | "FizzBuzz" |
      | 45     | "FizzBuzz" |
      | 225    | "FizzBuzz" |
      | 13     | "None"     |