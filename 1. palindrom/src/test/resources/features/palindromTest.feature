@palindrom
Feature: palindrom check
Scenario Outline: Palindrome Test
Given a text <text>
When checking whether the text is a palindrome
Then the result should be <result>

Examples:
| text       | result |
| "racecar"  | true   |
| "hello"    | false  |
| "madam"    | true   |
| "level"    | true   |
