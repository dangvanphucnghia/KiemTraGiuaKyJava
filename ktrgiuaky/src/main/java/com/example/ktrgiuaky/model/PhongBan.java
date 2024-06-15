package com.example.ktrgiuaky.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Setter
@Getter
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "phongbans")
public class PhongBan {
    @Id
    private String MaPhong;
    @NotBlank(message = "Tên là bắt buộc")
    private String TenPhong;
}
