package phuong_tien_giao_thong.service;

import phuong_tien_giao_thong.entity.Motorbike;
import phuong_tien_giao_thong.repository.IMotorbikeRepository;
import phuong_tien_giao_thong.repository.MotorbikeRepossitory;

public class MotobikeService implements IMotobikeService{
IMotorbikeRepository motorbikeRepository= new MotorbikeRepossitory();
    @Override
    public Motorbike[] findAll() {
        return motorbikeRepository.findAll();
    }

    @Override
    public void  add(Motorbike motorbike) {
        motorbikeRepository.add(motorbike);

    }

    @Override
    public void display(Motorbike motorbike) {

    }

    @Override
    public void delete(Motorbike motorbike) {

    }
}
