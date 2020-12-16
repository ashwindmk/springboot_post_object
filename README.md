# Spring Boot Post Object

Demo project

### Example Post Request
```
curl --location --request POST 'http://localhost:8080/action/add' \
--header 'Content-Type: application/json' \
--data-raw '{
    "url": "https://www.google.com",
    "label": "CLICK",
    "layout": {
        "type": "button",
        "margin": [5, 5, 5, 5],
        "padding": [2, 2, 2, 2]
    }
}'
```
