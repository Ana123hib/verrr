package pe.edu.upc.aww.werecycle.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aww.werecycle.dtos.NotificationDTO;
import pe.edu.upc.aww.werecycle.entities.Notification;
import pe.edu.upc.aww.werecycle.serviceinterfaces.IUNotificationService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/NotificationController")
public class NotificationController {
    @Autowired
    private IUNotificationService nO;

    @PostMapping
    public void registrar(@RequestBody NotificationDTO dto) {
        ModelMapper m = new ModelMapper();
        Notification no = m.map(dto, Notification.class);
        nO.insert(no);
    }

    @GetMapping
    public List<NotificationDTO> listar() {
        return nO.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, NotificationDTO.class);
        }).collect(Collectors.toList());
    }


}
