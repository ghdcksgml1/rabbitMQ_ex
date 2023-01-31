# rabbitMQ_ex
Springboot + RabbitMQ를 통한 Producer Consumer 구현

<img width="1400" alt="스크린샷 2023-01-29 오후 4 39 03" src="https://user-images.githubusercontent.com/79779676/215312383-99664a6d-210c-4be4-a1f1-7b3ff4f8def8.png">

## Producer

- producer는 메시지를 보내는 어플리케이션이다. 
- Producer는 메시지를 Consumer에게 직접 보낼 수 없다.
- 오로지 RabbitMQ Broker로만 메시지를 전달할 수 있다.



## Consumer

- Consumer는 RabbitMQ Broker로부터 메시지를 읽어들인다.

## Queue

- Queue는 RabbitMQ Broker의 버퍼, 저장소 역할을 한다. (여기에 메시지가 쌓임)
- Producer에 의해 Queue에 메시지가 들어오고, Consumer에 의해 메시지가 읽힌다.
- 일단 메시지가 읽히면, 큐에서 메시지는 삭제된다.
- 따라서, 메시지는 딱 한번만 처리될 수 있다.

## Message

- 메시지는 RabbitMQ를 통해 Producer가 Consumer에게 전달하려는 정보이다.

## Exchange

- Exchange는 Producer와 Consumer 사이에 중개자 역할을 한다.
- Producer가 queue에 직접 Message를 보내지 않고, Producer는 Exchange에 Message를 보낸다.
- Exchange는 설정된 규칙에 의해 하나 혹은 다수의 큐에 Message를 전달한다.
- 따라서, Producer는 이러한 Message들을 받는 큐에 대해 알 필요가 없다.
