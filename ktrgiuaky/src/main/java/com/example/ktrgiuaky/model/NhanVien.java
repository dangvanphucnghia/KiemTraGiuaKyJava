package com.example.ktrgiuaky.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "nhanviens")
public class NhanVien {
    @Id
    private String MaNV;
    private String TenNV;
    private String Phai;
    private String NoiSinh;
    @ManyToOne
    @JoinColumn(name = "phongban_id")
    private PhongBan phongban;
    private int Luong;
}
