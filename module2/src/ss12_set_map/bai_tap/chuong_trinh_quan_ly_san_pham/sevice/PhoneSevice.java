package ss12_set_map.bai_tap.chuong_trinh_quan_ly_san_pham.sevice;

import ss12_set_map.bai_tap.chuong_trinh_quan_ly_san_pham.entity.Phone;
import ss12_set_map.bai_tap.chuong_trinh_quan_ly_san_pham.repository.IPhoneRepository;
import ss12_set_map.bai_tap.chuong_trinh_quan_ly_san_pham.repository.PhoneRepository;

public class PhoneSevice implements IPhoneSevice {
    IPhoneRepository phoneRepository = new PhoneRepository();

    @Override
    public void add(Phone phone) {
        phoneRepository.add(phone);
    }
    @Override
    public void findId(int id) {
        phoneRepository.findId(id);
    }
    @Override
    public void update(Phone phone) {
        phoneRepository.update(phone);
    }

    @Override
    public void delete(int id) {
        phoneRepository.delete(id);
    }

    @Override
    public void display() {
        phoneRepository.display();
    }

    @Override
    public void seach(String name) {
        phoneRepository.seach(name);
    }

    @Override
    public void increaseSort() {
        phoneRepository.increaseSort();

    }

    @Override
    public void decreaseSort() {
        phoneRepository.decreaseSort();
    }


}
