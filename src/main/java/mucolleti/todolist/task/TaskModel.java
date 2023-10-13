package mucolleti.todolist.task;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import lombok.Data;

/*
  * Principais
  ID
  USUARIO (ID_USUARIO)
  DESCRIÇÃO
  TITULO
  DATA DE INICIO
  DATA DE TERMINO
  PRIORIDADE TASK
  */

  @Data
  @Entity(name = "tb_task")
public class TaskModel {


    @Id
    @GeneratedValue(generator = "UUID")
    private UUID idUser;

    private String description;
    @Column(length = 50)
    private String title;
    private LocalDateTime startAt;
    private LocalDateTime endAt;

    @CreationTimestamp
    private LocalDateTime createdAt;
    


    
}
