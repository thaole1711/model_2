package phuong_tien_giao_thong.service;

import phuong_tien_giao_thong.entity.Motorbike;

public interface IMotobikeService {
    Motorbike[] findAll();
    void add(Motorbike motorbike);
    void display(Motorbike motorbike);
    void delete(Motorbike motorbike);

}
