package ua.training.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;

import org.mockito.junit.jupiter.MockitoExtension;
import ua.training.controller.UserRestController;
import ua.training.model.entity.User;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @Mock
    public UserService userServicemock;

    @Mock
    User mockUser;

    @Mock
    UserRestController userControllerMock;

    List mockList = mock(ArrayList.class);

    @Test
    void findByUsernameAndPassword() {
        lenient().when(userServicemock.getUsers()).thenReturn(mockList);
        when(userServicemock.getUsers()).thenReturn(mockList);
        when(mockList.add(anyString())).thenReturn(true);
        userServicemock.getUsers();
        verify(userServicemock).getUsers();

    }

    @Test
    void shouldVerify() {
//        when(userControllerMock.getUsers()).thenReturn("new");
        userControllerMock.getUsers();
        verify(userControllerMock).getUsers();
        //        assertThrows(RuntimeException.class, userServicemock::getUsers);
    }
}