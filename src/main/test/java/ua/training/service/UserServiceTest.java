package ua.training.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import ua.training.rest.UserRestController;
import ua.training.model.entity.User;
import ua.training.service.impl.UserService;

import java.util.List;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {


    @Mock
    private UserService userServicemock;

    @Mock
    private User mockUser;

    @Mock
    private UserRestController userControllerMock;

    @Mock
    private List mockList;


    @Test
    void getUsers() {
        lenient().when(userServicemock.getUsers()).thenReturn(mockList);
        lenient().when(userServicemock.getUsers()).thenReturn(mockList);
        lenient().when(mockList.add(anyString())).thenReturn(true);
        userServicemock.getUsers();
        verify(userServicemock).getUsers();

    }

    @Test
    void shouldVerify() {
        //        when(userControllerMock.getUsers()).thenReturn("new");

//        verify(userServicemock).getUsers();
        //        assertThrows(RuntimeException

    }
}