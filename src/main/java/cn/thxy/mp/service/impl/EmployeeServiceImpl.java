package cn.thxy.mp.service.impl;

import cn.thxy.mp.domain.Employee;
import cn.thxy.mp.mapper.EmployeeMapper;
import cn.thxy.mp.service.EmployeeService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author bihuazhi
 * @since 2020-04-14
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {

}
