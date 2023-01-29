# rabbitMQ_ex
Springboot + RabbitMQ를 통한 Producer Consumer 구현

# Producer

- producer는 메시지를 보내는 어플리케이션이다. 
- Producer는 메시지를 Consumer에게 직접 보낼 수 없다.
- 오로지 RabbitMQ Broker로만 메시지를 전달할 수 있다.

<img width="1400" alt="스크린샷 2023-01-29 오후 4 39 03" src="https://user-images.githubusercontent.com/79779676/215312383-99664a6d-210c-4be4-a1f1-7b3ff4f8def8.png">
