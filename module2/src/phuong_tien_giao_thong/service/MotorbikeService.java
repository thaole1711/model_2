package phuong_tien_giao_thong.service;

import phuong_tien_giao_thong.entity.Motorbike;
import phuong_tien_giao_thong.repository.IMotorbikeRepository;
import phuong_tien_giao_thong.repository.MotorbikeRepository;

import java.util.List;

public class MotorbikeService implements IMotobikeService{
  private IMotorbikeRepository motorbikeRepository= new MotorbikeRepository();
    @Override
    public List<Motorbike> findAll() {
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
    public void delete(String numberPlate) {
        motorbikeRepository.delete(numberPlate);
    }
}
