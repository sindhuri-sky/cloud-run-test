Feature: Call basic endpoints

  @ft
  Scenario: Call hello world in functional
    Given setup app
    When the endpoint is called
    Then the response is Hello World
    And the response code is 200

  @int
  Scenario: Call hello world in int
    Given setup app
    When the endpoint is called
    Then the response is Hello World
    And the response code is 200