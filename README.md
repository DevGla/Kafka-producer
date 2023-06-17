# Kafka-producer

## 📋 Prerequisite
- SDK Java, Version 17
- Docker

## 🚀 Getting Started

### 1 - Clone the Project:

-- In your terminal, type:

<<<<<<< HEAD
-   `git@github.com:DevGla/Kafka-producer.git`
=======
-   `git clone git@github.com:grupoboticario/prodfin-processamento-credito-bonds-process-raw-service.git`
>>>>>>> 3cad728 (chore: Adjust readme and docker-compose)

### 2 - To rise the aplication containers

-- In your terminal, type:

<<<<<<< HEAD
-   `cd dockerfiles`
-   `docker-compose up -d`
=======
-   `make docker-start` - to start containers
-   `make docker-stop` - to stop containers
-   `make docker-remove-all` - to remove all containers
>>>>>>> 3cad728 (chore: Adjust readme and docker-compose)

### 3 - Run the project

-- Run the "main" function

<<<<<<< HEAD
### 1 - Create a topic in kafkaDrop
=======
After Getting Started

### 4 - Publish a message to Queue via Curl
<details>
  <summary>
    Command to publish the message
  </summary><br>

- `curl --request POST \
  --url http://localhost:8000/payment \
  --header 'Content-Type: application/json' \
  --data '{
  "id": "1",
  "userId": "1",
  "creditCardNumber": "0000000000000000",    
  "productId": "1"
  }'`

</details>

### 1 - Verify the message in topic (payment-topic) in kafkaDrop
<details>
  <summary>
    Follow this step by step
  </summary><br>

- Open browser on endpoint: - http://localhost:9100/
- Click in topic "payment-topic"
- Click in "View Messages"
- Click in "View Messages" again
- Verify if message was created

</details>
>>>>>>> 3cad728 (chore: Adjust readme and docker-compose)

## ✒️ Authors

-   George Lucas
