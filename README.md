# java-spring-boot-demo

* A super quick demo to using spring boot's api with gradle

## Requirements

* Java and Gradle (install with homebrew in my case)

## To Run

```./gradlew bootRun```

## API

<details>
 <summary><code>GET</code> <code><b>/hello</b></code> <code>(hello world example)</code></summary>

##### Parameters

> | name      |  type     | data type               | description             |
> |-----------|-----------|-------------------------|-------------------------|
> | None      |  required | object (JSON or YAML)   | N/A                     |


##### Responses

> | http code  | content-type                  | response                                    |
> |------------|-------------------------------|---------------------------------------------|
> | `200`      | `text/plain;charset=UTF-8`    | `Hello World!`                              |

</details>

------------------------- 

<details>
 <summary><code>GET</code> <code><b>/test/{id}</b></code> <code>(get request param example)</code></summary>

##### Parameters

> | name  | type    | data type             | description           |
> |-------|---------|-----------------------|---------------------|
> | Id | required | object (JSON or YAML) | N/A                   |


##### Responses

> | http code  | content-type                  | response    |
> |------------|-------------|---------------------------------------------|
> | `200`      | `text/plain;charset=UTF-8`    | `Test!{id}` |

</details>

------------------------- 

<details>
 <summary><code>POST</code> <code><b>/test/{id}</b></code> <code>(post request param example)</code></summary>

##### Parameters

> | name  | type    | data type             | description           |
> |-------|---------|-----------------------|---------------------|
> | Id | required | object (JSON or YAML) | N/A                   |


##### Responses

> | http code  | content-type                  | response   |
> |------------|------------|---------------------------------------------|
> | `200`      | `text/plain;charset=UTF-8`    | `Success!` |

</details>

------------------------- 